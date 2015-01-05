/**
 * This file is part of Everit - HTML Templating.
 *
 * Everit - HTML Templating is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - HTML Templating is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - HTML Templating.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.templating.html.internal;

import java.util.ArrayList;
import java.util.List;

public abstract class ParentNode implements HTMLNode {

    private final List<HTMLNode> children = new ArrayList<HTMLNode>();

    public List<HTMLNode> getChildren() {
        return children;
    }

    protected void renderChildren(final TemplateContextImpl templateContext) {
        for (HTMLNode ewtNode : children) {
            ewtNode.render(templateContext);
        }
    }
}
