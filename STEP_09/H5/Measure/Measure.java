package Measure;

public abstract class Measure{
    int x;
    protected abstract double max();
    protected abstract double min();
    protected abstract double avg();
    
    void dmy(){return;}
}