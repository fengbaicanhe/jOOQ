/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class VBook extends org.jooq.impl.TableImpl<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = -950712335;

	/**
	 * The singleton instance of v_book
	 */
	public static final org.jooq.test.ase.generatedclasses.tables.VBook V_BOOK = new org.jooq.test.ase.generatedclasses.tables.VBook();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord> __RECORD_TYPE = org.jooq.test.ase.generatedclasses.tables.records.VBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer>("id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> AUTHOR_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer>("author_id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> CO_AUTHOR_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer>("co_author_id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> DETAILS_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer>("details_id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.String> TITLE = new org.jooq.impl.TableFieldImpl<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.String>("title", org.jooq.impl.SQLDataType.VARCHAR, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> PUBLISHED_IN = new org.jooq.impl.TableFieldImpl<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer>("published_in", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> LANGUAGE_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer>("language_id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.String> CONTENT_TEXT = new org.jooq.impl.TableFieldImpl<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.String>("content_text", org.jooq.impl.SQLDataType.LONGVARCHAR, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, byte[]> CONTENT_PDF = new org.jooq.impl.TableFieldImpl<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, byte[]>("content_pdf", org.jooq.impl.SQLDataType.BINARY, V_BOOK);

	/**
	 * No further instances allowed
	 */
	private VBook() {
		super("v_book", org.jooq.test.ase.generatedclasses.Dbo.DBO);
	}
}
