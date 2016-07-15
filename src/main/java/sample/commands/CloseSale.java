package sample.commands;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class CloseSale implements Command {
	public boolean execute(Context ctx) throws Exception {
		System.out.println("Congratulations "
                  +ctx.get("customerName")
			+", you bought a new car!");
		return false;
	}
}