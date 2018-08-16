import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {


	public static void sendEmail() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(Constants.USERNAME, Constants.PASSWORD));
		email.setSSLOnConnect(true);
		email.setFrom("nksanoro@gmail.com");
		email.setSubject("QA TEAM");
		email.setMsg("At this point we finished our presentation about Quality Assurance, Thanks for Attention. With Best Regards " + 
				"Develandoo QA team :-)");
		email.addTo("ani.davtyan@makeinarmenia.com", 
				"ani.darbinyan@makeinarmenia.com",
				"anush.chakhoyan@makeinarmenia.com",
				"david.mkrtchyan@makeinarmenia.com",
				"liana.tumikyan@makeinarmenia.com",
				"mariam.martirosyan@makeinarmenia.com",
				"narek.hakobyan@makeinarmenia.com",
				"robert.hanesoghlyan@makeinarmenia.com", 
				"yevgine.shahinyan@makeinarmenia.com", 
				"artash.mardoyan@makeinarmenia.com", 
				"gagik.alikhanyan@makeinarmenia.com",
				"gevorg.gevorgyan@makeinarmenia.com",
				"artur.mkrtchyan@makeinarmenia.com",
				"artur.asatryan@makeinarmenia.com",
				"samvel.pahlevanyan@makeinarmenia.com", 
				"ashot.aslanian@makeinarmenia.com",
				"sevak.tahmazyan@makeinarmenia.com", 
				"norayr.sargsyan@makeinarmenia.com",
				"artur.darbinyan@makeinarmenia.com",
				"vika.martirosyan@makeinarmenia.com",
				"lilit.nalbandyan@makeinarmenia.com",
				"vache.hambardzumyan@makeinarmenia.com",
				"elizabeth.chichyan@makeinarmenia.com", 
				"margarita.artemyan@makeinarmenia.com",
				"ani.miraqyan@makeinarmenia.com",
				"ofelia.galstyan@makeinarmenia.com",
				"valentina.ghukasyan@makeinarmenia.com",
				"armen.ghambaryan@makeinarmenia.com",
				"sipan.muradyan@makeinarmenia.com",
				"ardalan.hosseini@makeinarmenia.com", 
				"lusine.mikayelyan@makeinarmenia.com",
				"syuzi.muradyan@makeinarmenia.com", 
				"narineh.hovhannisyan@makeinarmenia.com",
				"taguhi.arushanyan@makeinarmenia.com", 
				"taron.vanoyan@makeinarmenia.com",
				"davit.tumasyan@makeinarmenia.com" 
				);
		email.send();
	}

}
