/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscapeRoom;

/**
 *
 * @author 30694
 */
public class TextToText {
    private int[] order = new int[3];
    private String[] text1 = new String[3];
    private String[] text2 = new String[3];
    
    public TextToText(int order[],String text1[],String text2[]){
        for(int i=0 ; i<3 ; i++){
            this.order[i]=order[i];
            this.text1[i]=text1[i];
            this.text2[i]=text2[i];
        }
    }

    public int[] getOrder() {
        return order;
    }

    public String[] getText1() {
        return text1;
    }

    public String[] getText2() {
        return text2;
    }
}
