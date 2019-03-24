package com.yoclabo.sms;

import org.junit.Test;

public class MessageSendTest {

    @Test
    public void test01() {
        String accountSID = "";
        String authToken = "";
        String sendTo = "";
        String sendFrom = "";
        String messageBody = "";
        MessageSend s = new MessageSend();
        s.setAccountSID(accountSID);
        s.setAuthToken(authToken);
        s.setSendTo(sendTo);
        s.setSendFrom(sendFrom);
        s.setMessageBody(messageBody);
        try {
            s.run();
        } catch (Exception e) {
            java.lang.System.out.println(e.getMessage());
        }
    }
}
