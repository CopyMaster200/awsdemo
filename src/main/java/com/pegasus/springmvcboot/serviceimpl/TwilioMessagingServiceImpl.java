package com.pegasus.springmvcboot.serviceimpl;

import com.pegasus.springmvcboot.config.TwilioConfig;
import com.pegasus.springmvcboot.model.MessageDto;
import com.pegasus.springmvcboot.service.TwilioMessagingService;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Slf4j
@Service
public class TwilioMessagingServiceImpl implements TwilioMessagingService {
    @Autowired
    TwilioConfig twilioConfig;

    @Override
    public Message.Status sendSms(MessageDto messageDto) {
        PhoneNumber to = new PhoneNumber(messageDto.getReceiver());
        PhoneNumber from = new PhoneNumber(twilioConfig.getPhoneNumber());
        Message message = null;
        try {
            log.info("Inside try block");
            message = Message
                    .creator(to, from, messageDto.getMessageBody())
                    .create();
        } catch (Exception exception) {
            log.info("Message send failed due to: " + exception.getMessage());
        }

        // Check if message is null before accessing its status
        Message.Status status = (message != null) ? message.getStatus() : Message.Status.FAILED;
        log.info("Sms status: {}", status);
        return status;
    }
}
