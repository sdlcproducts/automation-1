package Docx;

import org.apache.poi.xwpf.usermodel.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Docx {
    XWPFDocument file;
    public Docx(XWPFDocument file) {
        this.file = file;
    }

    public XWPFDocument replaceDocxWords(HashMap<String, String> replacementWordsList){
//  String previousSunday= LocalDate.now().with( previous( SUNDAY ) ).toString();

        for (Map.Entry<String, String> mapEntry : replacementWordsList.entrySet())
        {
            String key = mapEntry.getKey();
            String value = mapEntry.getValue();


//  XWPFDocument doc = new XWPFDocument(OPCPackage.open("input.docx"));
//  for (String word : replacementWordsList ) {
            for (XWPFParagraph p : file.getParagraphs()) {
                List<XWPFRun> runs = p.getRuns();
                if (runs != null) {
                    for (XWPFRun r : runs) {
                        String text = r.getText(0);
                        if (text != null && text.contains(key)) {
                            text = text.replace(key, value);
                            r.setText(text, 0);
                        }
                    }
                }
            }
            for (XWPFTable tbl : file.getTables()) {
                for (XWPFTableRow row : tbl.getRows()) {
                    for (XWPFTableCell cell : row.getTableCells()) {
                        for (XWPFParagraph p : cell.getParagraphs()) {
                            for (XWPFRun r : p.getRuns()) {
                                String text = r.getText(0);
                                if (text != null && text.contains(key)) {
                                    text = text.replace(key, value);
                                    r.setText(text,0);
                                }
                            }
                        }
                    }
                }
            }
        }
//  }

        return file;
    }





}
