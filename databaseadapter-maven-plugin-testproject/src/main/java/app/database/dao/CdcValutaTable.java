
package app.database.dao;

import java.util.*;

import javax.annotation.Generated;
import javax.sql.DataSource;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.text.StrSubstitutor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;


/**
 * Represents {@code DAO} for table {@code CDC_VALUTA}.
 *
 * @author databaseadapter-maven-plugin
 */
@Generated(value="databaseadapter-maven-plugin")
public class CdcValutaTable {

	private static final Log LOG = LogFactory.getLog(CdcValutaTable.class);
	
	/**
	 * Contains the name of the table.
	 *
	 * <p>
	 * Can be used to format others {@code SQL}.
	 * </p>
	 */		
	public static final String TABLE = "cdc_valuta";
		
	/**
	 * Contains a preformatted {@code SELECT COUNT(*) FROM cdc_valuta}.
	 */		
	public static final String SQL_SELECT_COUNT = "SELECT COUNT(*) FROM " + TABLE;

	/**
	 * Contains a preformatted {@code SELECT * FROM cdc_valuta}.
	 */		
	public static final String SQL_SELECT_ALL = "SELECT * FROM " + TABLE;

	/**
	 * Contains a preformatted {@code DELETE FROM cdc_valuta}.
	 */		
	public static final String SQL_DELETE = "DELETE FROM " + TABLE;
	
	/**
	 * Contains all columns found in table {@code CDC_VALUTA}.
	 */
	public static enum Column {
		/**
		 * Represents column {@code S_VALUTA} of table {@code CDC_VALUTA}.
		 *
		 * <p>
		 * Descrizione valuta
		 * </p>
		 */
		s_valuta, // data type: 1111

		/**
		 * Represents column {@code I_COEFF} of table {@code CDC_VALUTA}.
		 *
		 * <p>
		 * Coefficiente rispetto a ??
		 * </p>
		 */
		i_coeff, // data type: 3

		/**
		 * Represents column {@code Q_DECIMALI} of table {@code CDC_VALUTA}.
		 *
		 * <p>
		 * Numero di decimali con cui si esprimono le cifre in valuta
		 * </p>
		 */
		q_decimali, // data type: 3

		/**
		 * Represents column {@code C_ENT_BSNS_VALUTA} of table {@code CDC_VALUTA}.
		 *
		 * <p>
		 * Codice univoco a livello di Sistema dell'Entita' di Business.
		 * </p>
		 */
		c_ent_bsns_valuta, // data type: 3

		/**
		 * Represents column {@code A_STATO} of table {@code CDC_VALUTA}.
		 *
		 * <p>
		 * Codice dello Stato
		 * </p>
		 */
		a_stato, // data type: 1

		/**
		 * Represents column {@code D_MDF} of table {@code CDC_VALUTA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		d_mdf, // data type: 93

		/**
		 * Represents column {@code N_LOGIN_MDF} of table {@code CDC_VALUTA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		n_login_mdf, // data type: 12

		/**
		 * Represents column {@code N_LOGIN_IN} of table {@code CDC_VALUTA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		n_login_in, // data type: 12

		/**
		 * Represents column {@code D_INI} of table {@code CDC_VALUTA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		d_ini, // data type: 93

		/**
		 * Represents column {@code D_FIN} of table {@code CDC_VALUTA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		d_fin, // data type: 93

		/**
		 * Represents column {@code V_VER} of table {@code CDC_VALUTA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		v_ver // data type: 3

	};

	@SuppressWarnings("unused")
	private final DataSource dataSource;
	private final NamedParameterJdbcTemplate namedJdbcTemplate;
	
	public CdcValutaTable(DataSource dataSource) {
		super();
		Validate.notNull(dataSource, "'dataSource' cannot be null");
		
		this.dataSource = dataSource;
		this.namedJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public void insert(CdcValutaTable.Record record) {
		LOG.info("inserting record " + record + "...");
		
		Column[] columns = record.keySet().toArray(new Column[]{ });
		String sql = new StringBuilder("INSERT INTO ")
			.append(TABLE)
			.append(" (")
			.append(StringUtils.join(namesOf(columns), ", "))
			.append(") VALUES (")
			.append(StringUtils.join(namesOf(columns, ":${name}"), ", "))
			.append(")")
			.toString();
		LOG.debug("... generated SQL: '" + sql);
			
		Map<String, Object> paramMap = new HashMap<String, Object>(columns.length);
		for (Map.Entry<Column, Object> entry : record.entrySet())
			paramMap.put(entry.getKey().name(), entry.getValue());
		
		LOG.debug("... executing statement with parameters: " + paramMap);
		
		int affected = namedJdbcTemplate.update(sql, paramMap);
		if (affected == 0)
			throw new IllegalStateException("execution of a SQL of insert has affected " + affected + " rows?!?");
		
		LOG.info("... insert of record " + record + " done");
	}

	public void update(CdcValutaTable.Record record) {
		throw new UnsupportedOperationException();
	}

	public void delete(CdcValutaTable.Record record) {
		throw new UnsupportedOperationException();
	}

	public boolean exist(CdcValutaTable.Record record) {
		throw new UnsupportedOperationException();
	}

	public void updateAll(Map<CdcValutaTable.Column, Object> what, Map<CdcValutaTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public void updateAll(Map<CdcValutaTable.Column, Object> what, String where) {
		throw new UnsupportedOperationException();
	}

	public void deleteAll(Map<CdcValutaTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public void deleteAll(String where) {
		throw new UnsupportedOperationException();
	}

	public CdcValutaTable.Record selectFirst(Map<CdcValutaTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public CdcValutaTable.Record selectFirst(String where) {
		throw new UnsupportedOperationException();
	}

	public List<CdcValutaTable.Record> selectAll(Map<CdcValutaTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public List<CdcValutaTable.Record> selectAll(String where) {
		throw new UnsupportedOperationException();
	}

	public void foreach(String where, Callback<CdcValutaTable.Record> callback) {
		throw new UnsupportedOperationException();
	}

	public void foreach(Map<CdcValutaTable.Column, Object> allMatches, Callback<CdcValutaTable.Record> callback) {
		throw new UnsupportedOperationException();
	}

	public int countAll() {
		throw new UnsupportedOperationException();
	}

	public int countAll(Map<CdcValutaTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public int countAll(String where) {
		throw new UnsupportedOperationException();
	}
	
	public boolean exist(Map<CdcValutaTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public boolean exist(String where) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the names of specified columns.
	 *
	 * @param columns an array of columns of table {@code CDC_VALUTA}
	 * @return names of specified columns
	 */
	public static String[] namesOf(CdcValutaTable.Column[] columns) {
		String[] cols = new String[columns.length];
		for (int i = 0; i < columns.length; i++) cols[i] = columns[i].name();
		return cols;
	}

	/**
	 * Returns the names of specified columns applying specified template.
	 * 
	 * <p>
	 * The template has to contain placeholder {@code name} to represent the column name. E.g.
	 * </p>
	 * <pre>
	 *     ${name} = ?
	 * </pre>
	 *
	 * @param columns an array of columns of table {@code CDC_VALUTA}
	 * @param template a template ala {@link StrSubstitutor} of {@code commons-lang} library
	 * @return names of specified columns
	 */
	public static String[] namesOf(CdcValutaTable.Column[] columns, String template) {
		Map<String, Object> map = new HashMap<String, Object>();
		String[] cols = new String[columns.length];
		for (int i = 0; i < columns.length; i++) {
			map.put("name", columns[i].name());
			cols[i] = StrSubstitutor.replace(template, map);
		}
		return cols;
	}
	
	public static class Record extends LinkedHashMap<CdcValutaTable.Column, Object> {
	
		private static final long serialVersionUID = 1L;

		public Record() {
			super(CdcValutaTable.Column.values().length);
		}

		/* S_VALUTA: String (1111) */
		public String getSValuta() { return (String) get(CdcValutaTable.Column.s_valuta); }

		public void setSValuta(String value) { put(CdcValutaTable.Column.s_valuta, value); }

		/* I_COEFF: java.math.BigDecimal (3) */
		public java.math.BigDecimal getICoeff() { return (java.math.BigDecimal) get(CdcValutaTable.Column.i_coeff); }

		public void setICoeff(java.math.BigDecimal value) { put(CdcValutaTable.Column.i_coeff, value); }

		/* Q_DECIMALI: java.math.BigDecimal (3) */
		public java.math.BigDecimal getQDecimali() { return (java.math.BigDecimal) get(CdcValutaTable.Column.q_decimali); }

		public void setQDecimali(java.math.BigDecimal value) { put(CdcValutaTable.Column.q_decimali, value); }

		/* C_ENT_BSNS_VALUTA: java.math.BigDecimal (3) */
		public java.math.BigDecimal getCEntBsnsValuta() { return (java.math.BigDecimal) get(CdcValutaTable.Column.c_ent_bsns_valuta); }

		public void setCEntBsnsValuta(java.math.BigDecimal value) { put(CdcValutaTable.Column.c_ent_bsns_valuta, value); }

		/* A_STATO: String (1) */
		public String getAStato() { return (String) get(CdcValutaTable.Column.a_stato); }

		public void setAStato(String value) { put(CdcValutaTable.Column.a_stato, value); }

		/* D_MDF: Date (93) */
		public Date getDMdf() { return (Date) get(CdcValutaTable.Column.d_mdf); }

		public void setDMdf(Date value) { put(CdcValutaTable.Column.d_mdf, value); }

		/* N_LOGIN_MDF: String (12) */
		public String getNLoginMdf() { return (String) get(CdcValutaTable.Column.n_login_mdf); }

		public void setNLoginMdf(String value) { put(CdcValutaTable.Column.n_login_mdf, value); }

		/* N_LOGIN_IN: String (12) */
		public String getNLoginIn() { return (String) get(CdcValutaTable.Column.n_login_in); }

		public void setNLoginIn(String value) { put(CdcValutaTable.Column.n_login_in, value); }

		/* D_INI: Date (93) */
		public Date getDIni() { return (Date) get(CdcValutaTable.Column.d_ini); }

		public void setDIni(Date value) { put(CdcValutaTable.Column.d_ini, value); }

		/* D_FIN: Date (93) */
		public Date getDFin() { return (Date) get(CdcValutaTable.Column.d_fin); }

		public void setDFin(Date value) { put(CdcValutaTable.Column.d_fin, value); }

		/* V_VER: java.math.BigDecimal (3) */
		public java.math.BigDecimal getVVer() { return (java.math.BigDecimal) get(CdcValutaTable.Column.v_ver); }

		public void setVVer(java.math.BigDecimal value) { put(CdcValutaTable.Column.v_ver, value); }


	}

}