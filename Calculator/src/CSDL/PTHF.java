package CSDL;

public class PTHF {
	private String vt;
	private String vs;
	private String U;

	public String getU() {
		return U;
	}

	public void setU(String u) {
		U = u;
	}

	public String getVt() {
		return vt;
	}

	public void setVt(String vt) {
		this.vt = vt;
	}

	public String getVs() {
		return vs;
	}

	public void setVs(String vs) {
		this.vs = vs;
	}

	public PTHF(String vt, String vs) {
		super();
		this.vt = vt;
		this.vs = vs;
	}

	public PTHF() {

	}

	@Override
	public String toString() {
		return vt + " -> " + vs + "";
	}
}
