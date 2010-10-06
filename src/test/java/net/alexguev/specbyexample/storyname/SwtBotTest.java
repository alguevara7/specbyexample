package net.alexguev.specbyexample.storyname;

import org.eclipse.swtbot.swt.finder.SWTBot;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotExampleLauncherClassRunner.class)
public class SwtBotTest {
	
	@Test
	public void testname() throws Exception {
		SWTBot swtBot = new SWTBot();
		swtBot.buttonWithLabel("OK").click();
	}
}
