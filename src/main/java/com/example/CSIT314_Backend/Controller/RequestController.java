package com.example.CSIT314_Backend.Controller;

import com.example.CSIT314_Backend.Model.Request;
import com.example.CSIT314_Backend.Service.RequestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/request")
@CrossOrigin
public class RequestController {

    @Autowired
    private RequestServiceImpl requestService;

    @GetMapping("/getAll")
    public List<Request> getAllRequests(){
        return requestService.getAllRequests();
    }

    @GetMapping("/getRequest/{id}")
    Request getRequestById(@PathVariable Long id) {
        return requestService.getRequestById(id);
    }

    @PostMapping("/addRequest")
    Request createRequest(@RequestBody Request newRequest) {return requestService.createRequest(newRequest);
    }

    @PutMapping("/updateRequest/{id}")
    Request updateRequest(@RequestBody Request request, @PathVariable Long id){
        return requestService.updateRequest(request, id);
    }

    @DeleteMapping("deleteRequest/{id}")
    void deleteRequest(@PathVariable Long id){
        requestService.deleteRequest(id);
    }
}
