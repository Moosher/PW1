package calc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import entity.Signo;

/**
 * @author fernando.felix
 *
 */
public class CalculaSigno {

	private static Map<String, Signo> signos;

	static {
		signos = new HashMap<>();
		signos.put("ÁRIES", new Signo(3, 21, 4, 19));
		signos.put("TOURO", new Signo(4, 21, 5, 20));
		signos.put("GÊMEOS", new Signo(5, 21, 6, 20));
		signos.put("CÂNCER", new Signo(6, 21, 7, 22));
		signos.put("LEÃO", new Signo(7, 23, 8, 22));
		signos.put("VIRGEM", new Signo(8, 23, 9, 22));
		signos.put("LIBRA", new Signo(9, 23, 10, 22));
		signos.put("ESCORPIÃO", new Signo(10, 23, 11, 21));
		signos.put("SAGITÁRIO", new Signo(11, 22, 12, 21));
		signos.put("CAPRICÓRNIO", new Signo(12, 22, 1, 19));
		signos.put("AQUÁRIO", new Signo(1, 20, 2, 18));
		signos.put("PEIXES", new Signo(2, 19, 3, 20));
	}

	public static String getSigno(int dia, int mes) {
		Set<String> keys = signos.keySet();
		for (String key : keys) {
			Signo signo = signos.get(key);
			if (signo.getMesInicio() == mes) {
				if (signo.getDiaInicio() >= dia) {
					return key;
				}
			} else if (signo.getMesFim() == mes) {
				if (signo.getDiaFim() <= dia) {
					return key;
				}
			}
		}
		return "algo novo no universo, parabéns!";
	}

}
