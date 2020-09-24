package com.fun;

public class TextBlock {
    public static void main(String[] args) {
        System.out.println(getSampleEmployeeData(false));
        System.out.println(getSampleEmployeeData(true));
    }

    private static String getSampleEmployeeData(boolean useTextBlockPreviewFeature) {
        String employeeTwentyThreeData = "{\n" +
                "    \"status\": \"success\",\n" +
                "    \"data\": {\n" +
                "        \"id\": 23,\n" +
                "        \"employee_name\": \"Caesar Vance\",\n" +
                "        \"employee_salary\": 106450,\n" +
                "        \"employee_age\": 21,\n" +
                "        \"profile_image\": \"\"\n" +
                "    },\n" +
                "    \"message\": \"Successfully! Record has been fetched.\"\n" +
                "}";

        //NOTE! This is a Java 14 PREVIEW feature. For this to compile correctly, please select the '14 (Preview)'
        // feature in the Project Language Level (File -> Project)
        String employeeOneData ="""
                                {
                                    "status": "success",
                                    "data": {
                                        "id": 1,
                                        "employee_name": "Tiger Nixon",
                                        "employee_salary": 320800,
                                        "employee_age": 61,
                                        "profile_image": ""
                                    },
                                    "message": "Successfully! Record has been fetched."
                                }
                                """;

        return useTextBlockPreviewFeature ? employeeOneData : employeeTwentyThreeData;
    }
}
