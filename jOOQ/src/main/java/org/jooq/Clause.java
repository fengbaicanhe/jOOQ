/**
 * Copyright (c) 2009-2013, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq;

/**
 * TODO [#2667]
 */
public enum Clause {

    /**
     * A placeholder clause for cases where the behaviour was not yet specified.
     * This will not go public, and is meant to be a placeholder during
     * development.
     */
    @Deprecated
    DUMMY,

    // -------------------------------------------------------------------------
    // Clauses used in a any type of statement to model catalog references
    // -------------------------------------------------------------------------

    CATALOG,

    // -------------------------------------------------------------------------
    // Clauses used in a any type of statement to model schema references
    // -------------------------------------------------------------------------

    SCHEMA,

    // -------------------------------------------------------------------------
    // Clauses used in a any type of statement to model table references
    // -------------------------------------------------------------------------

    /**
     * A complete table reference.
     * <p>
     * This "clause" surrounds a complete table reference as it can be encountered
     * in
     * <ul>
     * <li> {@link #SELECT_FROM}</li>
     * <li> {@link #INSERT_INSERT_INTO}</li>
     * <li> {@link #UPDATE_UPDATE}</li>
     * <li> {@link #DELETE_DELETE}</li>
     * <li> {@link #MERGE_MERGE_INTO}</li>
     * <li> {@link #TRUNCATE_TRUNCATE}</li>
     * </ul>
     */
    TABLE,

    /**
     *
     */
    TABLE_JOIN,
    TABLE_JOIN_INNER,
    TABLE_JOIN_CROSS,
    TABLE_JOIN_NATURAL,
    TABLE_JOIN_OUTER_LEFT,
    TABLE_JOIN_OUTER_RIGHT,
    TABLE_JOIN_OUTER_FULL,
    TABLE_JOIN_NATURAL_OUTER_LEFT,
    TABLE_JOIN_NATURAL_OUTER_RIGHT,
    TABLE_JOIN_ON,
    TABLE_JOIN_USING,
    TABLE_JOIN_PARTITION_BY,

    TABLE_FLASHBACK,
    TABLE_PIVOT,

    // -------------------------------------------------------------------------
    // Clauses used in a any type of statement to model column references
    // -------------------------------------------------------------------------

    FIELD,
    FIELD_CASE,
    FIELD_ROW,

    // -------------------------------------------------------------------------
    // Clauses used in a any type of statement to model condition references
    // -------------------------------------------------------------------------

    CONDITION,

    CONDITION_NULL,
    CONDITION_NULL_NOT,
    // TODO: Should operators be distinguished?
    // - LIKE predicate
    // - Subselect predicates
    // - RVE predicates
    // - Quantified predicates
    CONDITION_COMPARISON,
    CONDITION_BETWEEN,
    CONDITION_DISTINCT,
    CONDITION_DISTINCT_NOT,
    CONDITION_OVERLAPS,

    CONDITION_AND,
    CONDITION_OR,
    CONDITION_NOT,

    CONDITION_IN,
    CONDITION_IN_NOT,
    CONDITION_EXISTS,
    CONDITION_EXISTS_NOT,

    // -------------------------------------------------------------------------
    // Clauses that are used in a SELECT statement
    // -------------------------------------------------------------------------

    /**
     * A complete <code>SELECT</code> statement or a subselect.
     * <p>
     * This "clause" surrounds a complete <code>SELECT</code> statement, a
     * subselect, or a set operation, such as
     * <ul>
     * <li> {@link #SELECT_UNION}</li>
     * <li> {@link #SELECT_UNION_ALL}</li>
     * <li> {@link #SELECT_INTERSECT}</li>
     * <li> {@link #SELECT_EXCEPT}</li>
     * </ul>
     */
    SELECT,

    /**
     * A <code>UNION</code> set operation.
     * <p>
     * This clause surrounds two or more subselects (see {@link #SELECT})
     * concatenating them using a <code>UNION</code> set operation.
     */
    SELECT_UNION,

    /**
     * A <code>UNION ALL</code> set operation.
     * <p>
     * This clause surrounds two or more subselects (see {@link #SELECT})
     * concatenating them using a <code>UNION ALL</code> set operation.
     */
    SELECT_UNION_ALL,

    /**
     * A <code>INTERSECT</code> set operation.
     * <p>
     * This clause surrounds two or more subselects (see {@link #SELECT})
     * concatenating them using a <code>INTERSECT</code> set operation.
     */
    SELECT_INTERSECT,

    /**
     * A <code>EXCEPT</code> set operation.
     * <p>
     * This clause surrounds two or more subselects (see {@link #SELECT})
     * concatenating them using a <code>EXCEPT</code> set operation.
     */
    SELECT_EXCEPT,

    /**
     * A <code>SELECT</code> clause within a {@link #SELECT} statement or
     * subselect.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>SELECT</code> keyword</li>
     * <li>Oracle style hints</li>
     * <li>the T-SQL style <code>TOP .. START AT</code> clause</li>
     * <li>the select field list</li>
     * </ul>
     */
    SELECT_SELECT,

    /**
     * A <code>FROM</code> clause within a {@link #SELECT} statement or
     * subselect.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>FROM</code> keyword</li>
     * <li>the table reference list</li>
     * </ul>
     * <p>
     * See {@link #TABLE} and related clauses for possible table references.
     *
     * @see #TABLE
     */
    SELECT_FROM,
    SELECT_WHERE,
    SELECT_START_WITH,
    SELECT_CONNECT_BY,
    SELECT_GROUP_BY,
    SELECT_HAVING,
    SELECT_ORDER_BY,



    INSERT,
    INSERT_INSERT_INTO,
    INSERT_RETURNING,



    UPDATE,
    UPDATE_UPDATE,
    UPDATE_SET,
    UPDATE_SET_ASSIGNMENT,
    UPDATE_WHERE,
    UPDATE_RETURNING,


    DELETE,
    DELETE_DELETE,
    DELETE_WHERE,


    MERGE,
    MERGE_MERGE_INTO,



    TRUNCATE,
    TRUNCATE_TRUNCATE,
}