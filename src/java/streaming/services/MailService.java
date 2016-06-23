/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.services;

/**
 *
 * @author admin
 */
public class MailService {
    public void envoiMail(String mailDestinataire, String titre, String message){
        System.out.println("Envoi mail à : " + mailDestinataire + "\nObjet : " + titre + "\nCorps : " + message);
    }
}
