package com.pegasus.springmvcboot.service;

import com.pegasus.springmvcboot.model.MessageDto;
import com.twilio.rest.api.v2010.account.Message;

public interface TwilioMessagingService {
    Message.Status sendSms(MessageDto message);
}
