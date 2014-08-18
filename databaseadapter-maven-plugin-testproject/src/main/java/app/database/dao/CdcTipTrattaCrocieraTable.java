
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
 * Represents {@code DAO} for table {@code CDC_TIP_TRATTA_CROCIERA}.
 *
 * @author databaseadapter-maven-plugin
 */
@Generated(value="databaseadapter-maven-plugin")
public class CdcTipTrattaCrocieraTable {

	private static final Log LOG = LogFactory.getLog(CdcTipTrattaCrocieraTable.class);
	
	/**
	 * Contains the name of the table.
	 *
	 * <p>
	 * Can be used to format others {@code SQL}.
	 * </p>
	 */		
	public static final String TABLE = "cdc_tip_tratta_crociera";
		
	/**
	 * Contains a preformatted {@code SELECT COUNT(*) FROM cdc_tip_tratta_crociera}.
	 */		
	public static final String SQL_SELECT_COUNT = "SELECT COUNT(*) FROM " + TABLE;

	/**
	 * Contains a preformatted {@code SELECT * FROM cdc_tip_tratta_crociera}.
	 */		
	public static final String SQL_SELECT_ALL = "SELECT * FROM " + TABLE;

	/**
	 * Contains a preformatted {@code DELETE FROM cdc_tip_tratta_crociera}.
	 */		
	public static final String SQL_DELETE = "DELETE FROM " + TABLE;
	
	/**
	 * Contains all columns found in table {@code CDC_TIP_TRATTA_CROCIERA}.
	 */
	public static enum Column {
		/**
		 * Represents column {@code C_TIP_TRATTA_CROCIERA} of table {@code CDC_TIP_TRATTA_CROCIERA}.
		 *
		 * <p>
		 * Codice del tipo di Stato di attraversamento di una determinata tratta del piano di Crociera.
Valori ammissibili:
  'P' - Partenza (inizio Crociera)
  'N' - Navigazione
  'S' - Scalo
  'D' - Arrivo (fine Crociera)
  'A' - Attracco
  'T' - Transito
		 * </p>
		 */
		c_tip_tratta_crociera, // data type: 12

		/**
		 * Represents column {@code S_TIP_TRATTA_CROCIERA} of table {@code CDC_TIP_TRATTA_CROCIERA}.
		 *
		 * <p>
		 * Descrizione dello stato
		 * </p>
		 */
		s_tip_tratta_crociera, // data type: 1111

		/**
		 * Represents column {@code D_MDF} of table {@code CDC_TIP_TRATTA_CROCIERA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		d_mdf, // data type: 93

		/**
		 * Represents column {@code N_LOGIN_MDF} of table {@code CDC_TIP_TRATTA_CROCIERA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		n_login_mdf, // data type: 12

		/**
		 * Represents column {@code N_LOGIN_IN} of table {@code CDC_TIP_TRATTA_CROCIERA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		n_login_in, // data type: 12

		/**
		 * Represents column {@code D_INI} of table {@code CDC_TIP_TRATTA_CROCIERA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		d_ini, // data type: 93

		/**
		 * Represents column {@code D_FIN} of table {@code CDC_TIP_TRATTA_CROCIERA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		d_fin, // data type: 93

		/**
		 * Represents column {@code V_VER} of table {@code CDC_TIP_TRATTA_CROCIERA}.
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
	
	public CdcTipTrattaCrocieraTable(DataSource dataSource) {
		super();
		Validate.notNull(dataSource, "'dataSource' cannot be null");
		
		this.dataSource = dataSource;
		this.namedJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public void insert(CdcTipTrattaCrocieraTable.Record record) {
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

	public void update(CdcTipTrattaCrocieraTable.Record record) {
		throw new UnsupportedOperationException();
	}

	public void delete(CdcTipTrattaCrocieraTable.Record record) {
		throw new UnsupportedOperationException();
	}

	public boolean exist(CdcTipTrattaCrocieraTable.Record record) {
		throw new UnsupportedOperationException();
	}

	public void updateAll(Map<CdcTipTrattaCrocieraTable.Column, Object> what, Map<CdcTipTrattaCrocieraTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public void updateAll(Map<CdcTipTrattaCrocieraTable.Column, Object> what, String where) {
		throw new UnsupportedOperationException();
	}

	public void deleteAll(Map<CdcTipTrattaCrocieraTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public void deleteAll(String where) {
		throw new UnsupportedOperationException();
	}

	public CdcTipTrattaCrocieraTable.Record selectFirst(Map<CdcTipTrattaCrocieraTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public CdcTipTrattaCrocieraTable.Record selectFirst(String where) {
		throw new UnsupportedOperationException();
	}

	public List<CdcTipTrattaCrocieraTable.Record> selectAll(Map<CdcTipTrattaCrocieraTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public List<CdcTipTrattaCrocieraTable.Record> selectAll(String where) {
		throw new UnsupportedOperationException();
	}

	public void foreach(String where, Callback<CdcTipTrattaCrocieraTable.Record> callback) {
		throw new UnsupportedOperationException();
	}

	public void foreach(Map<CdcTipTrattaCrocieraTable.Column, Object> allMatches, Callback<CdcTipTrattaCrocieraTable.Record> callback) {
		throw new UnsupportedOperationException();
	}

	public int countAll() {
		throw new UnsupportedOperationException();
	}

	public int countAll(Map<CdcTipTrattaCrocieraTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public int countAll(String where) {
		throw new UnsupportedOperationException();
	}
	
	public boolean exist(Map<CdcTipTrattaCrocieraTable.Column, Object> allMatches) {
		throw new UnsupportedOperationException();
	}

	public boolean exist(String where) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the names of specified columns.
	 *
	 * @param columns an array of columns of table {@code CDC_TIP_TRATTA_CROCIERA}
	 * @return names of specified columns
	 */
	public static String[] namesOf(CdcTipTrattaCrocieraTable.Column[] columns) {
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
	 * @param columns an array of columns of table {@code CDC_TIP_TRATTA_CROCIERA}
	 * @param template a template ala {@link StrSubstitutor} of {@code commons-lang} library
	 * @return names of specified columns
	 */
	public static String[] namesOf(CdcTipTrattaCrocieraTable.Column[] columns, String template) {
		Map<String, Object> map = new HashMap<String, Object>();
		String[] cols = new String[columns.length];
		for (int i = 0; i < columns.length; i++) {
			map.put("name", columns[i].name());
			cols[i] = StrSubstitutor.replace(template, map);
		}
		return cols;
	}
	
	public static class Record extends LinkedHashMap<CdcTipTrattaCrocieraTable.Column, Object> {
	
		private static final long serialVersionUID = 1L;

		public Record() {
			super(CdcTipTrattaCrocieraTable.Column.values().length);
		}

		/* C_TIP_TRATTA_CROCIERA: String (12) */
		public String getCTipTrattaCrociera() { return (String) get(CdcTipTrattaCrocieraTable.Column.c_tip_tratta_crociera); }

		public void setCTipTrattaCrociera(String value) { put(CdcTipTrattaCrocieraTable.Column.c_tip_tratta_crociera, value); }

		/* S_TIP_TRATTA_CROCIERA: String (1111) */
		public String getSTipTrattaCrociera() { return (String) get(CdcTipTrattaCrocieraTable.Column.s_tip_tratta_crociera); }

		public void setSTipTrattaCrociera(String value) { put(CdcTipTrattaCrocieraTable.Column.s_tip_tratta_crociera, value); }

		/* D_MDF: Date (93) */
		public Date getDMdf() { return (Date) get(CdcTipTrattaCrocieraTable.Column.d_mdf); }

		public void setDMdf(Date value) { put(CdcTipTrattaCrocieraTable.Column.d_mdf, value); }

		/* N_LOGIN_MDF: String (12) */
		public String getNLoginMdf() { return (String) get(CdcTipTrattaCrocieraTable.Column.n_login_mdf); }

		public void setNLoginMdf(String value) { put(CdcTipTrattaCrocieraTable.Column.n_login_mdf, value); }

		/* N_LOGIN_IN: String (12) */
		public String getNLoginIn() { return (String) get(CdcTipTrattaCrocieraTable.Column.n_login_in); }

		public void setNLoginIn(String value) { put(CdcTipTrattaCrocieraTable.Column.n_login_in, value); }

		/* D_INI: Date (93) */
		public Date getDIni() { return (Date) get(CdcTipTrattaCrocieraTable.Column.d_ini); }

		public void setDIni(Date value) { put(CdcTipTrattaCrocieraTable.Column.d_ini, value); }

		/* D_FIN: Date (93) */
		public Date getDFin() { return (Date) get(CdcTipTrattaCrocieraTable.Column.d_fin); }

		public void setDFin(Date value) { put(CdcTipTrattaCrocieraTable.Column.d_fin, value); }

		/* V_VER: java.math.BigDecimal (3) */
		public java.math.BigDecimal getVVer() { return (java.math.BigDecimal) get(CdcTipTrattaCrocieraTable.Column.v_ver); }

		public void setVVer(java.math.BigDecimal value) { put(CdcTipTrattaCrocieraTable.Column.v_ver, value); }


	}

}