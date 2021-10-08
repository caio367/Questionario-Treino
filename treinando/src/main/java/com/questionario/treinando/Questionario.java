package com.questionario.treinando;

public class Questionario {

    private String pergunta, altA, altB, altC, altD, altCorreta;
    private int Nquest;


    public String getPergunta() { return pergunta;}

    public void setPergunta(String pergunta) { this.pergunta = pergunta;}

    public String getAltA() { return altA; }

    public void setAltA(String altA) { this.altA = altA; }

    public String getAltB() { return altB;}

    public void setAltB(String altB) { this.altB = altB; }

    public String getAltC() { return altC; }

    public void setAltC(String altC) { this.altC = altC; }

    public String getAltD() { return altD; }

    public void setAltD(String altD) { this.altD = altD; }

    public String getAltCorreta() { return altCorreta; }

    public void setAltCorreta(String altCorreta) { this.altCorreta = altCorreta; }

    public int getNquest() { return Nquest; }

    public void setNquest(int nquest) { Nquest = nquest; }

    public Questionario() {
    }

    public Questionario(String pergunta, String altA, String altB, String altC, String altD, String altCorreta,
            int nquest) {
        this.pergunta = pergunta;
        this.altA = altA;
        this.altB = altB;
        this.altC = altC;
        this.altD = altD;
        this.altCorreta = altCorreta;
        Nquest = nquest;
    }


    

    public void Escreva() {
        System.out.println("-----------------------");
        System.out.println("QUESTÃO " + Nquest);
        System.out.println(pergunta);
        System.out.println("-----------------------");
        System.out.println("( Opção A ) - "+ altA);
        System.out.println("( Opção B ) - "+ altB);
        System.out.println("( Opção C ) - "+ altC);
        System.out.println("( Opção D ) - "+ altD);
        System.out.printf("Sua resposta: " );
    }

    public boolean VerificarResp(String respUsuario) {
        return respUsuario == altCorreta;
    }



    





    
}
