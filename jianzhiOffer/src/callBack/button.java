package callBack;

public class button {

	public ClicKlistener clicKlistener;
	

	public interface ClicKlistener {
		public void jishuan();
	}

	public void setClicKlistener(ClicKlistener clicKlistener2) {
		clicKlistener = clicKlistener2;
	}
}
