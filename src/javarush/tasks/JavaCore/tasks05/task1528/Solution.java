package javarush.tasks.JavaCore.tasks05.task1528;

/* 
ООП. Hryvnia — тоже деньги
*/

public class Solution {
	public static void main(String[] args) {
		System.out.println(new Hryvnia().getAmount());
	}

	public static abstract class Money {
		abstract Money getMoney();

		public abstract Object getAmount();
	}

	//add your code below - добавь код ниже
	public static class Hryvnia extends Money {
		private double amount = 123d;

		public Hryvnia getMoney() {
			return this;
		}

		@Override
		public Object getAmount() {
			return new Double(amount);
		}
	}
}
