package jp.pomodoro.model.task;

public class Task
{
    private String name;

    public int sampleCals()
    {
        return 3;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Task [name=" + name + "]";
    }


}
