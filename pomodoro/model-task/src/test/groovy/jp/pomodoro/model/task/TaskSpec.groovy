package jp.pomodoro.model.task

import spock.lang.Specification;

class TaskSpec extends Specification
{
    def "length of Spock's and his friends' names"()
    {
        Task task = new Task()
        int a = task.sampleCals()

        expect:
        a == 3
    }
}
