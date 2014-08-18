
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
 * Represents {@code DAO} for table {@code CDC_CAMBIO_REUTERS}.
 *
 * @author databaseadapter-maven-plugin
 */
@Generated(value="databaseadapter-maven-plugin")
public class CdcCambioReutersTable {

	private static final Log LOG = LogFactory.getLog(CdcCambioReutersTable.class);
	
	/**
	 * Contains the name of the table.
	 *
	 * <p>
	 * Can be used to format others {@code SQL}.
	 * </p>
	 */		
	public static final String TABLE = "cdc_cambio_reuters";
		
	/**
	 * Contains a preformatted {@code SELECT COUNT(*) FROM cdc_cambio_reuters}.
	 */		
	public static final String SQL_SELECT_COUNT = "SELECT COUNT(*) FROM " + TABLE;

	/**
	 * Contains a preformatted {@code SELECT * FROM cdc_cambio_reuters}.
	 */		
	public static final String SQL_SELECT_ALL = "SELECT * FROM " + TABLE;

	/**
	 * Contains a preformatted {@code DELETE FROM cdc_cambio_reuters}.
	 */		
	public static final String SQL_DELETE = "DELETE FROM " + TABLE;
	
	/**
	 * Contains all columns found in table {@code CDC_CAMBIO_REUTERS}.
	 */
	public static enum Column {
		/**
		 * Represents column {@code D_VAL} of table {@code CDC_CAMBIO_REUTERS}.
		 *
		 * <p>
		 * Data di validita' del cambio
		 * </p>
		 */
		d_val, // data type: 93

		/**
		 * Represents column {@code G_CAMBIO_REUTERS} of table {@code CDC_CAMBIO_REUTERS}.
		 *
		 * <p>
		 * Sigla Reutes che indica le due valute coinvolte nel cambio seguite dalla stringa FIX.  Ad. es: MTLAEDFIX
		 * </p>
		 */
		g_cambio_reuters, // data type: 12

		/**
		 * Represents column {@code V_CAMBIO_REUTERS} of table {@code CDC_CAMBIO_REUTERS}.
		 *
		 * <p>
		 * Tasso di Cambio per il giorno D_VAL
		 * </p>
		 */
		v_cambio_reuters, // data type: 3

		/**
		 * Represents column {@code C_ENT_BSNS_VALUTA_A} of table {@code CDC_CAMBIO_REUTERS}.
		 *
		 * <p>
		 * Valuta destinazione

		 * </p>
		 */
		c_ent_bsns_valuta_a, // data type: 3

		/**
		 * Represents column {@code C_ENT_BSNS_VALUTA_DA} of table {@code CDC_CAMBIO_REUTERS}.
		 *
		 * <p>
		 * Valuta fonte

		 * </p>
		 */
		c_ent_bsns_valuta_da, // data type: 3

		/**
		 * Represents column {@code D_MDF} of table {@code CDC_CAMBIO_REUTERS}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		d_mdf, // data type: 93

		/**
		 * Represents column {@code N_LOGIN_MDF} of table {@code CDC_CAMBIO_REUTERS}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		n_login_mdf, // data type: 12

		/**
		 * Represents column {@code N_LOGIN_IN} of table {@code CDC_CAMBIO_REUTERS}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		n_login_in, // data type: 12

		/**
		 * Represents column {@code D_INI} of table {@code CDC_CAMBIO_REUTERS}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		d_ini, // data type: 93

		/**
		 * Represents column {@code D_FIN} of table {@code CDC_CAMBIO_REUTERS}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		d_fin, // data type: 93

		/**
		 * Represents column {@code V_VER} of table {@code CDC_CAMBIO_REUTERS}.
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
	
	public CdcCambioReutersTable(DataSource dataSource) {
		super();
		Validate.notNull(dataSource, "'dataSource' cannot be null");
		
		this.dataSource = dataSource;
		this.namedJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public void insert(CdcCambioReutersTable.Record record) {
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

	public void update(CdcCambioReutersTable.Record record) {
		throw new UnsupportedOperationException();
	}

	public void delete(CdcCambioReutersTable.Record record) {
		throw new UnsupportedOperationException();
	}

	public boolean exist(CdcCambioReutersTable.Record record) {
		throw new UnsupportedOperationException();
	}

	public void updateAll(Map<CdcCambioReutersTable.Column, Object> what, Map<CdcCambioReutersTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public void updateAll(Map<CdcCambioReutersTable.Column, Object> what, String where) {
		throw new UnsupportedOperationException();
	}

	public void deleteAll(Map<CdcCambioReutersTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public void deleteAll(String where) {
		throw new UnsupportedOperationException();
	}

	public CdcCambioReutersTable.Record selectFirst(Map<CdcCambioReutersTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public CdcCambioReutersTable.Record selectFirst(String where) {
		throw new UnsupportedOperationException();
	}

	public List<CdcCambioReutersTable.Record> selectAll(Map<CdcCambioReutersTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public List<CdcCambioReutersTable.Record> selectAll(String where) {
		throw new UnsupportedOperationException();
	}

	public void foreach(String where, Callback<CdcCambioReutersTable.Record> callback) {
		throw new UnsupportedOperationException();
	}

	public void foreach(Map<CdcCambioReutersTable.Column, Object> allMatches, Callback<CdcCambioReutersTable.Record> callback) {
		throw new UnsupportedOperationException();
	}

	public int countAll() {
		throw new UnsupportedOperationException();
	}

	public int countAll(Map<CdcCambioReutersTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public int countAll(String where) {
		throw new UnsupportedOperationException();
	}
	
	public boolean exist(Map<CdcCambioReutersTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public boolean exist(String where) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the names of specified columns.
	 *
	 * @param columns an array of columns of table {@code CDC_CAMBIO_REUTERS}
	 * @return names of specified columns
	 */
	public static String[] namesOf(CdcCambioReutersTable.Column[] columns) {
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
	 * @param columns an array of columns of table {@code CDC_CAMBIO_REUTERS}
	 * @param template a template ala {@link StrSubstitutor} of {@code commons-lang} library
	 * @return names of specified columns
	 */
	public static String[] namesOf(CdcCambioReutersTable.Column[] columns, String template) {
		Map<String, Object> map = new HashMap<String, Object>();
		String[] cols = new String[columns.length];
		for (int i = 0; i < columns.length; i++) {
			map.put("name", columns[i].name());
			cols[i] = StrSubstitutor.replace(template, map);
		}
		return cols;
	}
	
	public static class Record extends LinkedHashMap<CdcCambioReutersTable.Column, Object> {
	
		private static final long serialVersionUID = 1L;

		public Record() {
			super(CdcCambioReutersTable.Column.values().length);
		}

		/* D_VAL: Date (93) */
		public Date getDVal() { return (Date) get(CdcCambioReutersTable.Column.d_val); }

		public void setDVal(Date value) { put(CdcCambioReutersTable.Column.d_val, value); }

		/* G_CAMBIO_REUTERS: String (12) */
		public String getGCambioReuters() { return (String) get(CdcCambioReutersTable.Column.g_cambio_reuters); }

		public void setGCambioReuters(String value) { put(CdcCambioReutersTable.Column.g_cambio_reuters, value); }

		/* V_CAMBIO_REUTERS: java.math.BigDecimal (3) */
		public java.math.BigDecimal getVCambioReuters() { return (java.math.BigDecimal) get(CdcCambioReutersTable.Column.v_cambio_reuters); }

		public void setVCambioReuters(java.math.BigDecimal value) { put(CdcCambioReutersTable.Column.v_cambio_reuters, value); }

		/* C_ENT_BSNS_VALUTA_A: java.math.BigDecimal (3) */
		public java.math.BigDecimal getCEntBsnsValutaA() { return (java.math.BigDecimal) get(CdcCambioReutersTable.Column.c_ent_bsns_valuta_a); }

		public void setCEntBsnsValutaA(java.math.BigDecimal value) { put(CdcCambioReutersTable.Column.c_ent_bsns_valuta_a, value); }

		/* C_ENT_BSNS_VALUTA_DA: java.math.BigDecimal (3) */
		public java.math.BigDecimal getCEntBsnsValutaDa() { return (java.math.BigDecimal) get(CdcCambioReutersTable.Column.c_ent_bsns_valuta_da); }

		public void setCEntBsnsValutaDa(java.math.BigDecimal value) { put(CdcCambioReutersTable.Column.c_ent_bsns_valuta_da, value); }

		/* D_MDF: Date (93) */
		public Date getDMdf() { return (Date) get(CdcCambioReutersTable.Column.d_mdf); }

		public void setDMdf(Date value) { put(CdcCambioReutersTable.Column.d_mdf, value); }

		/* N_LOGIN_MDF: String (12) */
		public String getNLoginMdf() { return (String) get(CdcCambioReutersTable.Column.n_login_mdf); }

		public void setNLoginMdf(String value) { put(CdcCambioReutersTable.Column.n_login_mdf, value); }

		/* N_LOGIN_IN: String (12) */
		public String getNLoginIn() { return (String) get(CdcCambioReutersTable.Column.n_login_in); }

		public void setNLoginIn(String value) { put(CdcCambioReutersTable.Column.n_login_in, value); }

		/* D_INI: Date (93) */
		public Date getDIni() { return (Date) get(CdcCambioReutersTable.Column.d_ini); }

		public void setDIni(Date value) { put(CdcCambioReutersTable.Column.d_ini, value); }

		/* D_FIN: Date (93) */
		public Date getDFin() { return (Date) get(CdcCambioReutersTable.Column.d_fin); }

		public void setDFin(Date value) { put(CdcCambioReutersTable.Column.d_fin, value); }

		/* V_VER: java.math.BigDecimal (3) */
		public java.math.BigDecimal getVVer() { return (java.math.BigDecimal) get(CdcCambioReutersTable.Column.v_ver); }

		public void setVVer(java.math.BigDecimal value) { put(CdcCambioReutersTable.Column.v_ver, value); }


	}

}