package chapter4.alice.view;

import chapter4.alice.domain.witness.Witness;
import chapter4.alice.domain.witness.WitnessFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static chapter4.alice.view.InputRequest.TESTIMONY_REQUEST;
import static chapter4.alice.view.InputRequest.WITNESS_TYPE_REQUEST;
import static chapter4.alice.view.WitnessType.*;

public class InputView {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Witness createWitness(){
        WitnessType witnessType = getWitnessType();
        String testimony = getInput(TESTIMONY_REQUEST.getMessage());
        return WitnessFactory.createWitness(witnessType, testimony);
    }

    private WitnessType getWitnessType(){
        String input = getInput(WITNESS_TYPE_REQUEST.getMessage());
        if(ALICE.isTheInput(input)){
            return ALICE;
        }
        if(COOK.isTheInput(input)){
            return COOK;
        }
        if(MAD_HATTER.isTheInput(input)){
            return MAD_HATTER;
        }
        System.out.println("올바르지 않은 증인입니다. 다시 입력해주세요.");
        return getWitnessType();
    }

    private String getInput(String requestMessage){
        try{
            System.out.print(requestMessage + " : ");
            return br.readLine();
        } catch (Exception e){
            System.out.println();
            return getInput(requestMessage);
        }
    }
}
