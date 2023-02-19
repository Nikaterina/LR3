package com.example.lr1.service;

import com.example.lr1.model.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Qualifier("ModifySystemTime")
public class ModifySystemTime implements MyModifyService {
    @Override
    public Response modify(Response response){

        response.setSystemTime("");

        return response;
    }

}
