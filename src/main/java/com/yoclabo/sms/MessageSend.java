/*
 *
 * MessageSend.java
 *
 * Copyright 2019 Yuichi Yoshii
 *     吉井雄一 @ 吉井産業  you.65535.kir@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.yoclabo.sms;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class MessageSend {

    private String accountSID;
    private String authToken;

    private String sendTo;
    private String sendFrom;
    private String messageBody;

    public void setAccountSID(String arg) {
        accountSID = arg;
    }

    public void setAuthToken(String arg) {
        authToken = arg;
    }

    public void setSendTo(String arg) {
        sendTo = arg;
    }

    public void setSendFrom(String arg) {
        sendFrom = arg;
    }

    public void setMessageBody(String arg) {
        messageBody = arg;
    }

    public void run() {
        Twilio.init(accountSID, authToken);
        Message.creator(new PhoneNumber(sendTo), new PhoneNumber(sendFrom), messageBody).create();
    }
}
