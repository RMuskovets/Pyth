
import java.io.*;
import java.util.*;

public class Spaced {
	private String data;

	public Spaced(String fileName) {
		try {
			String all = "", line;
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			while ((line = br.readLine()) != null) {
				all += line;
			}
			data = all;
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void run() {
		Deque<String> stack = new LinkedList<>();
		for (String line : data.split("\n")) {
			String[] spl = line.split(":");
			String cmd = spl[0];
			if (cmd == print) System.out.println(stack.peek());
			else if (cmd == push) {
				String expr = expression(spl[1]);
			}
		}
	}

	public String expression(String text) {
		if (text.startsWith(num)) {
			String number = text.replaceFirst(num, "").replaceAll(one, "1").replaceAll(zero, "0");
			int len = number.length();
			int result = 0;
			for (int i = 1; i <= len; i ++) {
				int index = i - 1;
				char val = number.charAt(index);
				if (val == '1') result += (i > 1 )
			}
		}
	}

	static final String io = "\t \t";
	static final String print = io + " ";
	static final String num = "\t  ";
	static final String zero = "\t";
	static final String one = " ";
	static final String str = "\t\t\t ";
	static final String push = "\t\t  \t";
	static final String pop = "\t\t   \t;"
	static final String peek = "\t\t \t\t;";

}