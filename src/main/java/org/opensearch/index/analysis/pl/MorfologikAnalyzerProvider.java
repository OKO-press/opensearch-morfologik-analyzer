/*
 * SPDX-License-Identifier: Apache-2.0
 */
package org.opensearch.index.analysis.pl;

import org.apache.lucene.analysis.morfologik.MorfologikAnalyzer;
import org.opensearch.common.settings.Settings;
import org.opensearch.env.Environment;
import org.opensearch.index.IndexSettings;
import org.opensearch.index.analysis.AbstractIndexAnalyzerProvider;

public class MorfologikAnalyzerProvider extends AbstractIndexAnalyzerProvider<MorfologikAnalyzer> {

    private final MorfologikAnalyzer analyzer;

    public MorfologikAnalyzerProvider(IndexSettings indexSettings, Environment environment, String name, Settings settings) {
        super(indexSettings, name, settings);

        analyzer = new MorfologikAnalyzer();
    }

    @Override
    public MorfologikAnalyzer get() {
        return this.analyzer;
    }
}
