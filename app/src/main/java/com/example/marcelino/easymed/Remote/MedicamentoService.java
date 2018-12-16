package com.example.marcelino.easymed.Remote;

import com.example.marcelino.easymed.Model.Capabilities;
import com.example.marcelino.easymed.Model.Capability;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MedicamentoService {

    @GET("catalog/capabilities/{name}")
    Call<Capability> buscarMedicamento(@Path("name") String Medicamento);

    @GET("catalog/capabilities/")
    Call<Capabilities> buscarTodosMedicamentos();



}
