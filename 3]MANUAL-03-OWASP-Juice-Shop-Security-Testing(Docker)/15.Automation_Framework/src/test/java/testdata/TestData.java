package testdata;

public final class TestData {

    private TestData() {
        // Prevent instantiation
    }

    // ================= SQL INJECTION DATA =================
    public static Object[][] sqlPayloads() {
        return new Object[][]{
                {"' OR '1'='1"},
                {"\" OR \"1\"=\"1"},
                {"admin'--"},
                {"' OR 1=1--"},
                {"' OR '1'='1' #"}
        };
    }

    // ================= XSS DATA =================
    public static Object[][] xssPayloads() {
        return new Object[][]{
                {"<script>alert(1)</script>"},
                {"<img src=x onerror=alert(1)>"},
                {"<svg onload=alert(1)>"},
                {"<body onload=alert('XSS')>"}
        };
    }

    // ================= LOGIN DATA =================
    public static Object[][] loginData() {
        return new Object[][]{
                {"test@test.com", "Test@123"},
                {"admin@juice.com", "admin123"},
                {"invalid@user.com", "wrongpass"}
        };
    }
}