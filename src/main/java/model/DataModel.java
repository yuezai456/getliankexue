package model;

import lombok.Data;

@Data
public class DataModel {
    String code;
    String message;
    Value value;
    SubjectLevelList subjectLevelList;
}

