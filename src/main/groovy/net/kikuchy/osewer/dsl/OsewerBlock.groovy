package net.kikuchy.osewer.dsl

import net.kikuchy.osewer.entity.AlignmentSheet
import org.gradle.api.NamedDomainObjectContainer

/**
 * Created by kikuchy on 2015/10/20.
 */
class OsewerBlock {
    private final NamedDomainObjectContainer<AlignmentSheet> alignmentSheet

    public OsewerBlock(NamedDomainObjectContainer<AlignmentSheet> alSheet) {
        alignmentSheet = alSheet
    }

    public alignments(Closure closure) {
        alignmentSheet.configure(closure)
    }
}
