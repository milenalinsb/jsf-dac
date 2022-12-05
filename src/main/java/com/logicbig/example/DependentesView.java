package com.logicbig.example;

import com.logicbig.example.controller.DependenteController;
import com.logicbig.example.controller.response.DependenteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.util.List;

@Component
@ViewScoped
public class DependentesView {

    @Autowired
    private DependenteController dependenteController;

    public List<DependenteResponse> getMsg() {
        return dependenteController.readAll()c;
    }

}
