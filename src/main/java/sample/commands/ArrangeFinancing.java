package sample.commands;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class ArrangeFinancing implements Command {
	public boolean execute(Context ctx) throws Exception {
		System.out.println("Arrange financing");
		return false;
	}
}