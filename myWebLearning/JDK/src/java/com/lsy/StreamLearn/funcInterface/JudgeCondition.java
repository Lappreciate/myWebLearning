package com.lsy.StreamLearn.funcInterface;

import com.lsy.StreamLearn.entity.Student;

@FunctionalInterface
public interface JudgeCondition {
    boolean judge(Student student);
}
