/**
 * This file is part of Everit - Web Templating.
 *
 * Everit - Web Templating is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - Web Templating is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - Web Templating.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.templating.web.internal;

import org.everit.expression.CompiledExpression;
import org.htmlparser.lexer.PageAttribute;

public class HTMLAttribute {

    private final CompiledExpression expression;

    private final PageAttribute pageAttribute;

    public HTMLAttribute(final PageAttribute pageAttribute, final CompiledExpression expression) {
        this.pageAttribute = pageAttribute;
        this.expression = expression;
    }

    public CompiledExpression getExpression() {
        return expression;
    }

    public PageAttribute getPageAttribute() {
        return pageAttribute;
    }
}