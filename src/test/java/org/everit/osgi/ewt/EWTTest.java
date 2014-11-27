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
package org.everit.osgi.ewt;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.htmlparser.util.ParserException;
import org.junit.Test;

public class EWTTest {

    @Test
    public void test1() {
        TemplateEngine engine = new TemplateEngine(new MvelExpressionCompiler());

        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("META-INF/test1.html");

        try {
            CompiledTemplate compiledTemplate = engine.compileTemplate(stream, "UTF8");
            OutputStreamWriter writer = new OutputStreamWriter(System.out);
            HashMap<String, Object> vars = new HashMap<String, Object>();

            List<User> users = new ArrayList<User>();
            users.add(new User("Niels", "Holgerson"));
            users.add(new User("B", "Zs"));

            vars.put("users", users);
            compiledTemplate.render(writer, vars);
            writer.flush();
        } catch (ParserException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}