/*
 * SPDX-License-Identifier: Apache-2.0
 */
package org.opensearch.plugin.analysis.morfologik;

import org.apache.lucene.analysis.Analyzer;
import org.opensearch.index.analysis.AnalyzerProvider;
import org.opensearch.index.analysis.TokenFilterFactory;
import org.opensearch.index.analysis.pl.MorfologikAnalyzerProvider;
import org.opensearch.index.analysis.pl.MorfologikTokenFilterFactory;
import org.opensearch.indices.analysis.AnalysisModule.AnalysisProvider;
import org.opensearch.plugins.AnalysisPlugin;
import org.opensearch.plugins.Plugin;

import static java.util.Collections.singletonMap;

import java.util.HashMap;
import java.util.Map;

public class AnalysisMorfologikPlugin extends Plugin implements AnalysisPlugin {
    @Override
    public Map<String, AnalysisProvider<TokenFilterFactory>> getTokenFilters() {
        Map<String, AnalysisProvider<TokenFilterFactory>> filters = new HashMap<>();
        filters.put("morfologik_stem", MorfologikTokenFilterFactory::new);
        return filters;
    }

    @Override
    public Map<String, AnalysisProvider<AnalyzerProvider<? extends Analyzer>>> getAnalyzers() {
        return singletonMap("morfologik", MorfologikAnalyzerProvider::new);
    }
}
