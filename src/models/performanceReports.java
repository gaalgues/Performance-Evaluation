
package models;

import java.io.Serializable;

public class performanceReports implements Serializable{
    private String name;
    private String month;
    private String year;
    private String communication;
    private String teamWork;
    private String problemSolving;
    private String quality;
    private String csat;
    private String aht;
    private String kudos;
    private String firstTimeResolution;
    private String attendance;
    private String punctuality;
    private String strengths;
    private String areasForImprovement;
    private String additionalNotes;
    
    
    public performanceReports(String name, String month, String year, String communication, String teamWork, String problemSolving, String quality,
    String csat, String aht, String kudos, String firstTimeResolution, String attendance, String punctuality, String strengths, String areasForImprovement, 
    String additionalNotes) {
        this.name = name;
        this.month = month;
        this.year = year;
        this.communication = communication;
        this.teamWork = teamWork;
        this.problemSolving = problemSolving;
        this.quality = quality;
        this.csat = csat;
        this.aht = aht;
        this.kudos = kudos;
        this.firstTimeResolution = firstTimeResolution;
        this.attendance = attendance;
        this.punctuality = punctuality;
        this.strengths = strengths;
        this.areasForImprovement = areasForImprovement;
        this.additionalNotes = additionalNotes;
    }

    public performanceReports() {
        this.name = "";
        this.month = "";
        this.year = "";
        this.communication = "";
        this.teamWork = "";
        this.problemSolving = "";
        this.quality = "";
        this.csat = "";
        this.aht = "";
        this.kudos = "";
        this.firstTimeResolution = "";
        this.attendance = "";
        this.punctuality = "";
        this.strengths = "";
        this.areasForImprovement = "";
        this.additionalNotes = "";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;  
    }    
    
    public String getCommunication() {
        return communication;
    }
    public void setCommunication(String communication) {
        this.communication = communication;
    }
    
    public String getTeamWork() {
        return teamWork;
    }
    public void setTeamWork(String teamWork) {
        this.teamWork = teamWork;
    }
    
    public String getProblemSolving() {
        return problemSolving;
    }
    public void setProblemSolving(String problemSolving) {
        this.problemSolving = problemSolving;
    }
    
    public String getQuality() {
        return quality;
    }
    public void setQuality (String quality){
        this.quality = quality;
    }
    
    public String getCsat(){
        return csat;
    }
    public void setCsat(String csat) {
        this.csat = csat;}
    
    public String getAht (){
    return aht;
    }
    public void setAht(String aht){
        this.aht = aht;
    }
    
    public String getKudos (){
        return kudos;
    }
    public void setKudos (String kudos){
        this.kudos = kudos;
    }
    
    public String getFirstTimeResolution (){
        return firstTimeResolution;
    }
    public void setFirstTimeResolution (String firstTimeResolution){
        this.firstTimeResolution = firstTimeResolution;
    }
    
    public String getAttendance (){
        return attendance;
    }
    public void setAttendance (String attendance){
        this.attendance = attendance;
    }
    public String getPunctuality (){
        return punctuality;
    }  
    public void setPunctuality (String punctuality){
        this.punctuality = punctuality;
    }
    
    public String getStrengths (){
        return strengths;
    }
    public void setStrengths (String strengths){
        this.strengths = strengths;
    }
    
    public String getAreasForImprovement (){
        return areasForImprovement;
    }
    public void setAreasForImprovement (String areasForImprovement) {
        this.areasForImprovement = areasForImprovement;
    }
    
    public String getAdditionalNotes (){
        return additionalNotes;
    }
    public void setAdditionalNotes (String additionalNotes){
        this.additionalNotes = additionalNotes;
    }
}
