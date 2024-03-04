package com.st.gateway.controller;

import com.alibaba.csp.sentinel.adapter.gateway.common.api.ApiDefinition;
import com.alibaba.csp.sentinel.adapter.gateway.common.api.GatewayApiDefinitionManager;
import com.alibaba.csp.sentinel.adapter.gateway.common.rule.GatewayFlowRule;
import com.alibaba.csp.sentinel.adapter.gateway.common.rule.GatewayRuleManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author leon
 * @date 2024/1/8 00:54
 */
@RestController
public class GatewayFlowRulesController {
    /**
     * 获取当前系统的限流策略
     */
    @GetMapping("/gw/flow/rules")
    public Set<GatewayFlowRule> getCurrentGatewayFlowRules() {
        return GatewayRuleManager.getRules();
    }

    /**
     * 获取定义的api分组
     */
    @GetMapping("/gw/api/groups")
    public Set<ApiDefinition> getApiGroups() {
        return GatewayApiDefinitionManager.getApiDefinitions();
    }
}
