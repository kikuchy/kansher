package net.kikuchy.kansher.dsl

import net.kikuchy.kansher.entity.AlignmentSheet
import org.gradle.api.NamedDomainObjectContainer

/**
 * Created by kikuchy on 2015/10/20.
 */
class KansherBlock {
    private final NamedDomainObjectContainer<AlignmentSheet> alignmentSheet

    public KansherBlock(NamedDomainObjectContainer<AlignmentSheet> alSheet) {
        alignmentSheet = alSheet
    }

    public alignments(Closure closure) {
        alignmentSheet.configure(closure)
    }
}
