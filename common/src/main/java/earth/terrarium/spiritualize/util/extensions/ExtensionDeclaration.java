package earth.terrarium.spiritualize.util.extensions;

import java.lang.annotation.*;

/**
 * It kinda like, does the thing that sorta corresponds with {@link ExtensionDeclaration}
 */

@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface ExtensionDeclaration {
}
