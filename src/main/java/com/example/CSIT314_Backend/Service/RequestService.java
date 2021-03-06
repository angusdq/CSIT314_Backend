package com.example.CSIT314_Backend.Service;

import com.example.CSIT314_Backend.Exceptions.CustomException;
import com.example.CSIT314_Backend.Model.Request;
import com.example.CSIT314_Backend.Repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService implements RequestServiceImpl {
    @Autowired
    private RequestRepository requestRepository;

    public List<Request> getAllRequests(){
        return requestRepository.findAll();
    }

    public Request getRequestById(Long id) {
        return requestRepository.findById(id).orElseThrow(() -> new CustomException(id, "Request"));
    }

    public Request createRequest(Request newRequest){
        return requestRepository.save(newRequest);
    }

    //Code is from https://spring.io/guides/tutorials/rest/
    public Request updateRequest(Request request, Long id){
        return requestRepository.findById(id)
                .map(requestMap -> {
                    requestMap.setRequest(request);
                    return requestRepository.save(request);
                })
                .orElseGet(() -> {
                    request.setId(id);
                    return requestRepository.save(request);
                });
    }

    public void deleteRequest(Long id){
        requestRepository.deleteById(id);
    }
}
