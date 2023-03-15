package model;

import lombok.Data;

@Data
public class Value {
    int previousExamTime;
    String previousExamName;
    SubjectLevelList subjectLevelList;
}
