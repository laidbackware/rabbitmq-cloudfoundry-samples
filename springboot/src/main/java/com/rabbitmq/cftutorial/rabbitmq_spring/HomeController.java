package com.rabbitmq.cftutorial.rabbitmq_spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    // @Autowired AmqpTemplate amqpTemplate;

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute(new Message());
        return "index";
    }

    @RequestMapping(value = "/publish", method=RequestMethod.POST)
    public String publish(Model model, Message message) {
        // Send a message to the "messages" queue
        // amqpTemplate.convertAndSend("messages", message.getValue());
        model.addAttribute("published", true);
        return index(model);
    }

    @RequestMapping(value = "/get", method=RequestMethod.POST)
    public String get(Model model) {
        // Receive a message from the "messages" queue
        // String message = (String)amqpTemplate.receiveAndConvert("messages");
        String message = "blah";
        if (message != null)
            model.addAttribute("got", message);
        else
            model.addAttribute("got_queue_empty", true);

        return index(model);
    }
}
