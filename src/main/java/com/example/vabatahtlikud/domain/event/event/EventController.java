package com.example.vabatahtlikud.domain.event.event;

import com.example.vabatahtlikud.domain.event.task.TaskInfo;
import com.example.vabatahtlikud.domain.event.task.TaskRequest;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    @Resource
    private EventService eventService;

    @PostMapping("/task")
    @Operation(summary = "Lisab uue tööülesande")
    public List<TaskInfo> addTask (@RequestBody TaskRequest request) {
        return eventService.addTask(request);
    }

}
