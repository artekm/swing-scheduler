package pl.itacademy.schedule.parameters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;

public class EnteredParameters {

    private Integer hoursNumber;

    private LocalDate startDate;

    private LocalTime beginTime;

    private LocalTime endTime;

    private Collection<DayOfWeek> lessonDays;

    private boolean showHelp;

    private String fileName;

    public Integer getHoursNumber() {
        return hoursNumber;
    }

    public void setHoursNumber(Integer hoursNumber) {
        this.hoursNumber = hoursNumber;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Collection<DayOfWeek> getLessonDays() {
        return lessonDays;
    }

    public void setLessonDays(Collection<DayOfWeek> lessonDays) {
        this.lessonDays = lessonDays;
    }

    public boolean isShowHelp() {
        return showHelp;
    }

    public void setShowHelp(boolean showHelp) {
        this.showHelp = showHelp;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
