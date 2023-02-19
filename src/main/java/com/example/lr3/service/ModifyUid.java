package com.example.lr1.service;

import com.example.lr1.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("id1")
public class ModifyUid implements MyModifyService {
    @Override
    public Response modify(Response response){

        response.setUid("New Uid");

        return response;
    }

}
