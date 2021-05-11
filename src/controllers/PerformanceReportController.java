
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import models.performanceReports;
import views.PerformanceEvaluationMain;

public class PerformanceReportController implements ActionListener{
    PerformanceEvaluationMain performanceView;
    performanceReports performanceModel;
    JFileChooser f;
public PerformanceReportController (PerformanceEvaluationMain performanceView){
    super();
    this.performanceView = performanceView;
    f = new JFileChooser();
    performanceModel = new performanceReports();
}
        
    public performanceReports getPerformanceModel(){
        return performanceModel;
    }    
    public void setPerformanceModel (performanceReports performanceModel){
        this.performanceModel = performanceModel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Save":
                f.showSaveDialog(performanceView);
                performanceModel = performanceView.getPerformanceReportsData();
                writePerformanceReports(f.getSelectedFile());
                break;
            case "Open":
                f.showOpenDialog(performanceView);
                performanceModel = readPerformanceReports(f.getSelectedFile());
                performanceView.setPerformanceReportsData(performanceModel);
                break;
            case "Clear":
                performanceView.clear();
                break;
        }
    }
    
    public void writePerformanceReports(File file){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(performanceModel);
            oos.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public performanceReports readPerformanceReports(File file){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            return (performanceReports)ois.readObject();
            
        }
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
         catch(IOException|ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}

