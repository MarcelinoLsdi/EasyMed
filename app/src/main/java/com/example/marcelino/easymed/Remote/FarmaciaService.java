package com.example.marcelino.easymed.Remote;

import com.example.marcelino.easymed.Model.Capabilities;
import com.example.marcelino.easymed.Model.Resources;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FarmaciaService {


    @GET("catalog/resources/search?capability={name}")
    Call<Resources> buscarFarmaciaPeloMedicamento(@Path("name") String Medicamento);

    @GET("catalog/resources/search?capability={name}&lat={lat}&lon={lon}&radius={raio}")
    Call<Capabilities> buscarFarmaciaPeloMedicamentoEPosicao(@Path("name") String Medicamento,
                                                             @Path("lat") Float lat,
                                                             @Path("lon") Float lon,
                                                             @Path("raio") Double raio
    );
}
