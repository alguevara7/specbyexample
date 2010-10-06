package net.alexguev.specbyexample.storyname;

import net.alexguev.specbyexample.App;

import org.eclipse.swtbot.swt.finder.junit.SWTBotApplicationLauncherClassRunner;

public class SWTBotExampleLauncherClassRunner extends SWTBotApplicationLauncherClassRunner {

	public SWTBotExampleLauncherClassRunner(Class<?> klass) throws Exception {
		super(klass);
	}

	@Override
	public void startApplication() {
		App.main(new String[] { "arguments", "to", "your application" });
	}

}
